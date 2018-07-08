package com.yixun.infrastructure.serializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class MyDatetimeSerializer extends StdSerializer<Date>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public MyDatetimeSerializer()
	{
		this(null);
	}

	public MyDatetimeSerializer(Class t)
	{
		super(t);
	}

	@Override
	public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException
	{
		jgen.writeString(formatter.format(value));

	}

}
