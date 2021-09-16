package net.monggu.exception;

import net.monggu.ExcelException;

public class UnSupportedExcelTypeException extends ExcelException {

	public UnSupportedExcelTypeException(String message) {
		super(message, null);
	}

}
