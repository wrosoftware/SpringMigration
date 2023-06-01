package com.wsa.spring.migration.springmigration._common.entity.type;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import java.util.UUID;

public class UuidType extends AbstractSingleColumnStandardBasicType<UUID> {

    public static final UuidType INSTANCE = new UuidType();

    public UuidType() {
        super(VarcharTypeDescriptor.INSTANCE, UuidTypeDescriptor.INSTANCE);
    }

    @Override
    public String getName() {
        return CustomType.UUID;
    }
}
