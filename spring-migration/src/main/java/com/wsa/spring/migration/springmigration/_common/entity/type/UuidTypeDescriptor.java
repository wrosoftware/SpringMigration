package com.wsa.spring.migration.springmigration._common.entity.type;

import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractTypeDescriptor;
import org.hibernate.type.descriptor.java.ImmutableMutabilityPlan;

import java.util.UUID;

public class UuidTypeDescriptor extends AbstractTypeDescriptor<UUID> {

    public static final UuidTypeDescriptor INSTANCE = new UuidTypeDescriptor();

    public UuidTypeDescriptor() {
        super(UUID.class, ImmutableMutabilityPlan.INSTANCE);
    }

    @Override
    public UUID fromString(String s) {
        return UUID.fromString(s);
    }

    @Override
    public <X> X unwrap(UUID uuid, Class<X> type, WrapperOptions wrapperOptions) {
        if (uuid == null) {
            return null;
        }else if (String.class.isAssignableFrom(type)) {
            return (X) uuid.toString();
        } else {
            throw unknownUnwrap(type);
        }
    }

    @Override
    public <X> UUID wrap(X x, WrapperOptions wrapperOptions) {
        if (x == null) {
            return null;
        } else if(x instanceof String value) {
            return UUID.fromString(value);
        } else {
            throw unknownWrap(x.getClass());
        }
    }
}
