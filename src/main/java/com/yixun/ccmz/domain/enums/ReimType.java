package com.yixun.ccmz.domain.enums;

public enum ReimType
{
	门诊大病, 住院, 特殊疾病;

	public int value()
	{
		switch (this)
		{
		case 门诊大病:
			return 15;
		case 住院:
			return 21;
		case 特殊疾病:
			return 99;

		default:
			return -1;
		}
	}
}
