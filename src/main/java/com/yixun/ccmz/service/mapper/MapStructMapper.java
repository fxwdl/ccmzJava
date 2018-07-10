package com.yixun.ccmz.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;

@Mapper
public interface MapStructMapper
{
	MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);

	BnTreatmentreimburse BnTreatmentreimburseModelToTreatmentreimburse(BnTreatmentreimburseModel model);
}
