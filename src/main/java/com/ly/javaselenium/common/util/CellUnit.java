package com.ly.javaselenium.common.util;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;

import static org.apache.poi.ss.usermodel.Cell.*;

/**
 * @author 李岩
 * @data 2021/11/4 16:59
 */
public class CellUnit {

    public static String getCellValue(Sheet sheet, int rowNum, int cellNum) {
        Cell cell = sheet.getRow(rowNum).getCell(cellNum);
        String value = CellUnit.getCellValue2(cell);
        return value;
    }

    public static String getCellValue2(Cell cell) {
        String value = "";
        switch (cell.getCellType()) {
            case CELL_TYPE_STRING:
                value = String.valueOf(cell.getRichStringCellValue());
                return value;
            case CELL_TYPE_NUMERIC:
                value = String.valueOf(cell.getNumericCellValue());
                return value;
            case CELL_TYPE_BOOLEAN:
                value = String.valueOf(cell.getBooleanCellValue());
                return value;
            case CELL_TYPE_FORMULA:
                value = String.valueOf(cell.getCellFormula());
                return value;
            case CELL_TYPE_ERROR:
                value = String.valueOf(cell.getErrorCellValue());
                return value;
            case CELL_TYPE_BLANK:
                return value;
            default:
                return value;
        }

    }

}
