package com.ly.javaselenium.common.util;

import jxl.Cell;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import jxl.read.biff.BiffException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 李岩
 * @data 2021/11/4 14:50
 */
public class ExcelData {
    public Workbook workbook;
    public Sheet sheet;
    public Cell cell;
    int rows;
    int columns;
    public String fileName;
    public String caseName;
    public ArrayList<String> arrkey = new ArrayList<String>();
    String sourceFile;
    public InputStream is;

    /**
     * @param fileName excel文件名
     * @param caseName sheet名
     */
    public ExcelData(String fileName, String caseName) {
        super();
        this.fileName = fileName;
        this.caseName = caseName;
    }

    /**
     * 获得excel表中的数据
     */
    public Object[][] getExcelData() throws BiffException, IOException {
        ArrayList<String> arrkey = new ArrayList<String>();
        is=new FileInputStream(getPath());
        Workbook workbook = new XSSFWorkbook(is);

        Sheet sheet = workbook.getSheetAt(0);

        //获取总行数
        int rowTotalNum = sheet.getLastRowNum() + 1;
        //总列数
        int columns = sheet.getRow(0).getPhysicalNumberOfCells();

        HashMap<String, String>[][] map = new HashMap[rowTotalNum - 1][1];
        // 对数组中所有元素hashmap进行初始化
        if (rowTotalNum > 1) {
            for (int i = 0; i < rowTotalNum - 1; i++) {
                map[i][0] = new HashMap();
            }
        } else {
            System.out.println("测试的Excel" + getPath() + "中没有数据");
        }

        // 获得首行的列名，作为hashmap的key值
        for (int c = 0; c < columns; c++) {
            String cellvalue = CellUnit.getCellValue(sheet, 0, c);
            arrkey.add(cellvalue);
        }

        // 遍历所有的单元格的值添加到hashmap中
        for (int r = 1; r < rowTotalNum; r++) {
            for (int c = 0; c < columns; c++) {
                String cellvalue = CellUnit.getCellValue(sheet, r, c);
                map[r - 1][0].put(arrkey.get(c), cellvalue);
            }
        }
        return map;
    }

    /**
     * 获得excel文件的路径
     *
     * @return
     * @throws IOException
     */
    public String getPath() throws IOException {
        File directory = new File(".");
        sourceFile = directory.getCanonicalPath() + "\\src\\main\\resources\\"
                + fileName + ".xls";
        return sourceFile;
    }

}
