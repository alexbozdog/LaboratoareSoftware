package ro.ulbs.proiectaresoftware.lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;


public class AppLab8 {

    public void citesteExcel(String cale) {
        try (FileInputStream fis = new FileInputStream(new File(cale));
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = wb.getSheetAt(0);
            for (Row row : sheet) {
                for (Cell cell : row) {
                    if (cell.getCellType() == CellType.STRING) {
                        System.out.print(cell.getStringCellValue() + "\t");
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        System.out.print(cell.getNumericCellValue() + "\t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void medieValoare(String in, String out) {
        try (FileInputStream fis = new FileInputStream(new File(in));
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = wb.getSheetAt(0);
            for (Row row : sheet) {
                double v1 = row.getCell(3).getNumericCellValue();
                double v2 = row.getCell(4).getNumericCellValue();
                double v3 = row.getCell(5).getNumericCellValue();
                row.createCell(6).setCellValue((v1 + v2 + v3) / 3.0);
            }

            try (FileOutputStream fos = new FileOutputStream(out)) {
                wb.write(fos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void medieFormula(String in, String out) {
        try (FileInputStream fis = new FileInputStream(new File(in));
             XSSFWorkbook wb = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = wb.getSheetAt(0);
            for (Row row : sheet) {
                int rNum = row.getRowNum() + 1;
                row.createCell(6).setCellFormula("AVERAGE(D" + rNum + ":F" + rNum + ")");
            }

            try (FileOutputStream fos = new FileOutputStream(out)) {
                wb.write(fos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AppLab8 em = new AppLab8();
        String file = "laborator8_input.xlsx";

        em.citesteExcel(file);
        em.medieValoare(file, "laborator8_output2.xlsx");
        em.medieFormula(file, "laborator8_output3.xlsx");
    }
}