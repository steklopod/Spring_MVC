package ru.manager.mvc.converters;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JulianDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String strDate) {
		Date tmpDate = null;
		try {
			System.out.println("Конвертируем");
			tmpDate = new SimpleDateFormat("yyyyDDD").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return tmpDate;
	}

}
