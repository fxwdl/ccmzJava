package com.yixun.ccmz.domain.enums;

public enum Spec_BN
{
	无, 单次单报, 未参加基本医疗保险, 单病种定额付费_低自付大病补助, 医疗费用包干, 按床日付费;

	public int value()
	{
		return this.ordinal();
	}
}
