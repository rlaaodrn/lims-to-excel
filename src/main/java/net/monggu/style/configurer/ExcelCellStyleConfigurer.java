package net.monggu.style.configurer;

import net.monggu.style.align.ExcelAlign;
import net.monggu.style.align.NoExcelAlign;
import net.monggu.style.border.ExcelBorders;
import net.monggu.style.border.NoExcelBorders;
import net.monggu.style.color.DefaultExcelColor;
import net.monggu.style.color.ExcelColor;
import net.monggu.style.color.NoExcelColor;
import net.monggu.style.font.ExcelFont;
import net.monggu.style.font.NoExcelFont;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelCellStyleConfigurer {

	private ExcelAlign excelAlign = new NoExcelAlign();
	private ExcelColor foregroundColor = new NoExcelColor();
	private ExcelBorders excelBorders = new NoExcelBorders();
	private ExcelFont excelFont = new NoExcelFont();

	public ExcelCellStyleConfigurer() {

	}

	public ExcelCellStyleConfigurer excelAlign(ExcelAlign excelAlign) {
		this.excelAlign = excelAlign;
		return this;
	}

	public ExcelCellStyleConfigurer foregroundColor(int red, int blue, int green) {
		this.foregroundColor = DefaultExcelColor.rgb(red, blue, green);
		return this;
	}

	public ExcelCellStyleConfigurer excelBorders(ExcelBorders excelBorders) {
		this.excelBorders = excelBorders;
		return this;
	}

	public ExcelCellStyleConfigurer excelFont(ExcelFont excelFont) {
		this.excelFont = excelFont;
		return this;
	}


	public void configure(CellStyle cellStyle, Workbook wb) {
		excelAlign.apply(cellStyle);
		foregroundColor.applyForeground(cellStyle);
		excelBorders.apply(cellStyle);
		excelFont.apply(cellStyle, wb);
	}

}
