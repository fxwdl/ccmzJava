package com.yixun.infrastructure.deserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class MyDateDeserializer extends StdDeserializer<Date>
{
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

	public MyDateDeserializer()
	{
		this(null);
	}

	public MyDateDeserializer(Class<?> vc)
	{
		super(vc);
	}

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException
	{
		String date = p.getText();
		try
		{
			return formatter.parse(date);
		}
		catch (ParseException e)
		{
			throw new RuntimeException(e);
		}
	}

}