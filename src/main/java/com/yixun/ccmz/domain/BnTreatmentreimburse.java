package com.yixun.ccmz.domain;

import java.math.BigDecimal;
import java.util.Date;

public class BnTreatmentreimburse extends BaseModel
{
	private String ID;

	private Integer pay_Type;

	private String apply_Hospital_ID;

	private String reim_NO;

	private String sfzh;

	private Integer medicare_State;

	private String person_Code;

	private Integer reim_Source;

	private String billNO;

	private String treatmentHosptial_Code;

	private String treatmentHosptial;

	private String treatment_NO;

	private Integer reim_Type_ID;

	private Date in_Date;

	private Date out_Date;

	private Date medicare_Date;

	private Date typeIn_Date;

	private BigDecimal medicare_Line;

	private String stdDisease_Code;

	private String stdDisease_Name;

	private BigDecimal AMoney;

	private BigDecimal BMoney;

	private BigDecimal CMoney;

	private BigDecimal ZL_Money;

	private BigDecimal ZF_Money;

	private BigDecimal YLZ_Money;

	private BigDecimal GR_Money;

	private BigDecimal YBBX_Money;

	private BigDecimal XNH_Money;

	private String family_Code;

	private Date apply_Date;

	private BigDecimal DBBX_Money;

	private String card_NO;

	private Integer finish_Flag;

	private String sfLb;

	private String JGBM;

	private Integer printCount;

	private String operator_ID;

	private Date create_Time;

	private String pay_Operator_ID;

	private Date finish_Date;

	private BigDecimal selfBaseMoney;

	private BigDecimal YLJZ_Money;

	private Date cancel_Date;

	private String cancel_Operator_ID;

	private String memo;

	private String YB_Info;

	private BigDecimal YBHG_Money;

	private BigDecimal selfBaseMoney_Total;

	private BigDecimal YLJZ_Money_Total;

	private Integer spec_BN;

	private BigDecimal CYDBBC_Money;

	private Integer identityType_ID;

	private BigDecimal selBaseMoney_ZY_Total;

	private BigDecimal GR_Accout_Pay;

	private BigDecimal YB_Other_Pay;

	public String getID()
	{
		return ID;
	}

	public void setID(String ID)
	{
		this.ID = ID == null ? null : ID.trim();
	}

	public Integer getPay_Type()
	{
		return pay_Type;
	}

	public void setPay_Type(Integer pay_Type)
	{
		this.pay_Type = pay_Type;
	}

	public String getApply_Hospital_ID()
	{
		return apply_Hospital_ID;
	}

	public void setApply_Hospital_ID(String apply_Hospital_ID)
	{
		this.apply_Hospital_ID = apply_Hospital_ID == null ? null : apply_Hospital_ID.trim();
	}

	public String getReim_NO()
	{
		return reim_NO;
	}

	public void setReim_NO(String reim_NO)
	{
		this.reim_NO = reim_NO == null ? null : reim_NO.trim();
	}

	public String getSfzh()
	{
		return sfzh;
	}

	public void setSfzh(String sfzh)
	{
		this.sfzh = sfzh == null ? null : sfzh.trim();
	}

	public Integer getMedicare_State()
	{
		return medicare_State;
	}

	public void setMedicare_State(Integer medicare_State)
	{
		this.medicare_State = medicare_State;
	}

	public String getPerson_Code()
	{
		return person_Code;
	}

	public void setPerson_Code(String person_Code)
	{
		this.person_Code = person_Code == null ? null : person_Code.trim();
	}

	public Integer getReim_Source()
	{
		return reim_Source;
	}

	public void setReim_Source(Integer reim_Source)
	{
		this.reim_Source = reim_Source;
	}

	public String getBillNO()
	{
		return billNO;
	}

	public void setBillNO(String billNO)
	{
		this.billNO = billNO == null ? null : billNO.trim();
	}

	public String getTreatmentHosptial_Code()
	{
		return treatmentHosptial_Code;
	}

	public void setTreatmentHosptial_Code(String treatmentHosptial_Code)
	{
		this.treatmentHosptial_Code = treatmentHosptial_Code == null ? null : treatmentHosptial_Code.trim();
	}

	public String getTreatmentHosptial()
	{
		return treatmentHosptial;
	}

	public void setTreatmentHosptial(String treatmentHosptial)
	{
		this.treatmentHosptial = treatmentHosptial == null ? null : treatmentHosptial.trim();
	}

	public String getTreatment_NO()
	{
		return treatment_NO;
	}

	public void setTreatment_NO(String treatment_NO)
	{
		this.treatment_NO = treatment_NO == null ? null : treatment_NO.trim();
	}

	public Integer getReim_Type_ID()
	{
		return reim_Type_ID;
	}

	public void setReim_Type_ID(Integer reim_Type_ID)
	{
		this.reim_Type_ID = reim_Type_ID;
	}

	public Date getIn_Date()
	{
		return in_Date;
	}

	public void setIn_Date(Date in_Date)
	{
		this.in_Date = in_Date;
	}

	public Date getOut_Date()
	{
		return out_Date;
	}

	public void setOut_Date(Date out_Date)
	{
		this.out_Date = out_Date;
	}

	public Date getMedicare_Date()
	{
		return medicare_Date;
	}

	public void setMedicare_Date(Date medicare_Date)
	{
		this.medicare_Date = medicare_Date;
	}

	public Date getTypeIn_Date()
	{
		return typeIn_Date;
	}

	public void setTypeIn_Date(Date typeIn_Date)
	{
		this.typeIn_Date = typeIn_Date;
	}

	public BigDecimal getMedicare_Line()
	{
		return medicare_Line;
	}

	public void setMedicare_Line(BigDecimal medicare_Line)
	{
		this.medicare_Line = medicare_Line;
	}

	public String getStdDisease_Code()
	{
		return stdDisease_Code;
	}

	public void setStdDisease_Code(String stdDisease_Code)
	{
		this.stdDisease_Code = stdDisease_Code == null ? null : stdDisease_Code.trim();
	}

	public String getStdDisease_Name()
	{
		return stdDisease_Name;
	}

	public void setStdDisease_Name(String stdDisease_Name)
	{
		this.stdDisease_Name = stdDisease_Name == null ? null : stdDisease_Name.trim();
	}

	public BigDecimal getAMoney()
	{
		return AMoney;
	}

	public void setAMoney(BigDecimal AMoney)
	{
		this.AMoney = AMoney;
	}

	public BigDecimal getBMoney()
	{
		return BMoney;
	}

	public void setBMoney(BigDecimal BMoney)
	{
		this.BMoney = BMoney;
	}

	public BigDecimal getCMoney()
	{
		return CMoney;
	}

	public void setCMoney(BigDecimal CMoney)
	{
		this.CMoney = CMoney;
	}

	public BigDecimal getZL_Money()
	{
		return ZL_Money;
	}

	public void setZL_Money(BigDecimal ZL_Money)
	{
		this.ZL_Money = ZL_Money;
	}

	public BigDecimal getZF_Money()
	{
		return ZF_Money;
	}

	public void setZF_Money(BigDecimal ZF_Money)
	{
		this.ZF_Money = ZF_Money;
	}

	public BigDecimal getYLZ_Money()
	{
		return YLZ_Money;
	}

	public void setYLZ_Money(BigDecimal YLZ_Money)
	{
		this.YLZ_Money = YLZ_Money;
	}

	public BigDecimal getGR_Money()
	{
		return GR_Money;
	}

	public void setGR_Money(BigDecimal GR_Money)
	{
		this.GR_Money = GR_Money;
	}

	public BigDecimal getYBBX_Money()
	{
		return YBBX_Money;
	}

	public void setYBBX_Money(BigDecimal YBBX_Money)
	{
		this.YBBX_Money = YBBX_Money;
	}

	public BigDecimal getXNH_Money()
	{
		return XNH_Money;
	}

	public void setXNH_Money(BigDecimal XNH_Money)
	{
		this.XNH_Money = XNH_Money;
	}

	public String getFamily_Code()
	{
		return family_Code;
	}

	public void setFamily_Code(String family_Code)
	{
		this.family_Code = family_Code == null ? null : family_Code.trim();
	}

	public Date getApply_Date()
	{
		return apply_Date;
	}

	public void setApply_Date(Date apply_Date)
	{
		this.apply_Date = apply_Date;
	}

	public BigDecimal getDBBX_Money()
	{
		return DBBX_Money;
	}

	public void setDBBX_Money(BigDecimal DBBX_Money)
	{
		this.DBBX_Money = DBBX_Money;
	}

	public String getCard_NO()
	{
		return card_NO;
	}

	public void setCard_NO(String card_NO)
	{
		this.card_NO = card_NO == null ? null : card_NO.trim();
	}

	public Integer getFinish_Flag()
	{
		return finish_Flag;
	}

	public void setFinish_Flag(Integer finish_Flag)
	{
		this.finish_Flag = finish_Flag;
	}

	public String getSfLb()
	{
		return sfLb;
	}

	public void setSfLb(String sfLb)
	{
		this.sfLb = sfLb == null ? null : sfLb.trim();
	}

	public String getJGBM()
	{
		return JGBM;
	}

	public void setJGBM(String JGBM)
	{
		this.JGBM = JGBM == null ? null : JGBM.trim();
	}

	public Integer getPrintCount()
	{
		return printCount;
	}

	public void setPrintCount(Integer printCount)
	{
		this.printCount = printCount;
	}

	public String getOperator_ID()
	{
		return operator_ID;
	}

	public void setOperator_ID(String operator_ID)
	{
		this.operator_ID = operator_ID == null ? null : operator_ID.trim();
	}

	public Date getCreate_Time()
	{
		return create_Time;
	}

	public void setCreate_Time(Date create_Time)
	{
		this.create_Time = create_Time;
	}

	public String getPay_Operator_ID()
	{
		return pay_Operator_ID;
	}

	public void setPay_Operator_ID(String pay_Operator_ID)
	{
		this.pay_Operator_ID = pay_Operator_ID == null ? null : pay_Operator_ID.trim();
	}

	public Date getFinish_Date()
	{
		return finish_Date;
	}

	public void setFinish_Date(Date finish_Date)
	{
		this.finish_Date = finish_Date;
	}

	public BigDecimal getSelfBaseMoney()
	{
		return selfBaseMoney;
	}

	public void setSelfBaseMoney(BigDecimal selfBaseMoney)
	{
		this.selfBaseMoney = selfBaseMoney;
	}

	public BigDecimal getYLJZ_Money()
	{
		return YLJZ_Money;
	}

	public void setYLJZ_Money(BigDecimal YLJZ_Money)
	{
		this.YLJZ_Money = YLJZ_Money;
	}

	public Date getCancel_Date()
	{
		return cancel_Date;
	}

	public void setCancel_Date(Date cancel_Date)
	{
		this.cancel_Date = cancel_Date;
	}

	public String getCancel_Operator_ID()
	{
		return cancel_Operator_ID;
	}

	public void setCancel_Operator_ID(String cancel_Operator_ID)
	{
		this.cancel_Operator_ID = cancel_Operator_ID == null ? null : cancel_Operator_ID.trim();
	}

	public String getMemo()
	{
		return memo;
	}

	public void setMemo(String memo)
	{
		this.memo = memo == null ? null : memo.trim();
	}

	public String getYB_Info()
	{
		return YB_Info;
	}

	public void setYB_Info(String YB_Info)
	{
		this.YB_Info = YB_Info == null ? null : YB_Info.trim();
	}

	public BigDecimal getYBHG_Money()
	{
		return YBHG_Money;
	}

	public void setYBHG_Money(BigDecimal YBHG_Money)
	{
		this.YBHG_Money = YBHG_Money;
	}

	public BigDecimal getSelfBaseMoney_Total()
	{
		return selfBaseMoney_Total;
	}

	public void setSelfBaseMoney_Total(BigDecimal selfBaseMoney_Total)
	{
		this.selfBaseMoney_Total = selfBaseMoney_Total;
	}

	public BigDecimal getYLJZ_Money_Total()
	{
		return YLJZ_Money_Total;
	}

	public void setYLJZ_Money_Total(BigDecimal YLJZ_Money_Total)
	{
		this.YLJZ_Money_Total = YLJZ_Money_Total;
	}

	public Integer getSpec_BN()
	{
		return spec_BN;
	}

	public void setSpec_BN(Integer spec_BN)
	{
		this.spec_BN = spec_BN;
	}

	public BigDecimal getCYDBBC_Money()
	{
		return CYDBBC_Money;
	}

	public void setCYDBBC_Money(BigDecimal CYDBBC_Money)
	{
		this.CYDBBC_Money = CYDBBC_Money;
	}

	public Integer getIdentityType_ID()
	{
		return identityType_ID;
	}

	public void setIdentityType_ID(Integer identityType_ID)
	{
		this.identityType_ID = identityType_ID;
	}

	public BigDecimal getSelBaseMoney_ZY_Total()
	{
		return selBaseMoney_ZY_Total;
	}

	public void setSelBaseMoney_ZY_Total(BigDecimal selBaseMoney_ZY_Total)
	{
		this.selBaseMoney_ZY_Total = selBaseMoney_ZY_Total;
	}

	public BigDecimal getGR_Accout_Pay()
	{
		return GR_Accout_Pay;
	}

	public void setGR_Accout_Pay(BigDecimal GR_Accout_Pay)
	{
		this.GR_Accout_Pay = GR_Accout_Pay;
	}

	public BigDecimal getYB_Other_Pay()
	{
		return YB_Other_Pay;
	}

	public void setYB_Other_Pay(BigDecimal YB_Other_Pay)
	{
		this.YB_Other_Pay = YB_Other_Pay;
	}
}