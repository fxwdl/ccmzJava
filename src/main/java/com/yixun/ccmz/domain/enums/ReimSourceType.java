package com.yixun.ccmz.domain.enums;

public enum ReimSourceType
{
	本院, 外转;

	public int value()
	{
		return this.ordinal() + 1;
	}
}
