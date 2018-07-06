package com.yixun.ccmz.dto;

/**
 * 客户端返回结果
 * 
 * @author fx__w
 *
 * @param <T>
 */
public class ClientSingleObjectResult<T>
{
	private boolean success;
	private String msg;

	private T data;

	public ClientSingleObjectResult()
	{
	}

	public ClientSingleObjectResult(boolean success, String msg, T data)
	{
		this.success = success;
		this.msg = msg;
		this.data = data;
	}

	public boolean getSuccess()
	{
		return this.success;
	}

	public void setSuccess(boolean success)
	{
		this.success = success;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public T getData()
	{
		return data;
	}

	public void setData(T data)
	{
		this.data = data;
	}
}
