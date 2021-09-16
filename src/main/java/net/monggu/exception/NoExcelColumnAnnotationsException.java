package net.monggu.exception;

import net.monggu.ExcelException;

public class NoExcelColumnAnnotationsException extends ExcelException {

	public NoExcelColumnAnnotationsException(String message) {
		super(message, null);
	}

}
