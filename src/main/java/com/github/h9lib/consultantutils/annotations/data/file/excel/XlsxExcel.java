package com.github.h9lib.consultantutils.annotations.data.file.excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * Use this annotation on a model to indicate that the generated excel must be a .xlsx instead of .xls
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface XlsxExcel {
	//true if the excel version is 2007 or higher (.xlsx extension) - false if the excel version is 2003
	boolean isXlsxExcel() default true;
}
