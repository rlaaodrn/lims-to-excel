package net.monggu;


import net.monggu.style.ExcelCellStyle;

public @interface ExcelColumnStyle {
	Class<? extends ExcelCellStyle> excelCellStyleClass();
	String enumName() default "";
	boolean bold() default false;
}
