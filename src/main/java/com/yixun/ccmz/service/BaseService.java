package com.yixun.ccmz.service;

import java.lang.reflect.ParameterizedType;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import com.yixun.ccmz.domain.BnTreatmentreimburse;
import com.yixun.ccmz.dto.BnTreatmentreimburseModel;
import com.yixun.ccmz.service.mapper.MapStructMapper;

import static com.googlecode.jmapper.api.JMapperAPI.attribute;
import static com.googlecode.jmapper.api.JMapperAPI.mappedClass;

public class BaseService
{
	// protected MapStructMapper getMapper()
	// {
	// return MapStructMapper.INSTANCE;
	// }

	protected <D, S> JMapper<D, S> getMapper()
	{
		return new JMapper<D, S>(
				(Class<D>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0],
				(Class<S>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	protected JMapper<BnTreatmentreimburse, BnTreatmentreimburseModel> getBnTreatmentreimburseMapper()
	{
		JMapperAPI jmapperAPI = new JMapperAPI().add(mappedClass(BnTreatmentreimburse.class));

		return new JMapper<BnTreatmentreimburse, BnTreatmentreimburseModel>(BnTreatmentreimburse.class,
				BnTreatmentreimburseModel.class, jmapperAPI);
	}

	protected static ModelMapper mapper;
	static
	{
		mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	protected BnTreatmentreimburse MapTR(BnTreatmentreimburseModel model)
	{
		BnTreatmentreimburse r = mapper.map(model, BnTreatmentreimburse.class);
		return r;
	}

	protected BnTreatmentreimburseModel MapTRModel(BnTreatmentreimburse item)
	{
		BnTreatmentreimburseModel r = mapper.map(item, BnTreatmentreimburseModel.class);
		return r;
	}

	protected BnTreatmentreimburseModel MapTRModel(BnTreatmentreimburse item, BnTreatmentreimburseModel r)
	{
		mapper.map(item, r);
		return r;
	}
}
