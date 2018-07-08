package com.yixun.infrastructure.serializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * 日期序列号 其实也可以在field上应用@JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
 * "yyyy/MM/dd") 这里为了统一修改时间格式，所以用了这种方案
 * 
 * @author fx__w
 *
 */
public class MyDateSerializer extends StdSerializer<Date>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

	public MyDateSerializer()
	{
		this(null);
	}

	public MyDateSerializer(Class t)
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
