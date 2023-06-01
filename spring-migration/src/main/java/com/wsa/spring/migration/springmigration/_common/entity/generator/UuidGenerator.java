package com.wsa.spring.migration.springmigration._common.entity.generator;

import org.hibernate.Session;
import org.hibernate.tuple.ValueGenerator;

import java.util.UUID;

public class UuidGenerator implements ValueGenerator<UUID> {

    @Override
    public UUID generateValue(Session session, Object owner) {
        return UUID.randomUUID();
    }
}
