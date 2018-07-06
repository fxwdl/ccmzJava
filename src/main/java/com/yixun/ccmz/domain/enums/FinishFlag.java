package com.yixun.ccmz.domain.enums;

public enum FinishFlag
{
	未救助, 已救助, 已作废;

	public int value()
	{
		return this.ordinal();
	}
}
