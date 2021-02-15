/*
 * Licensed to DuraSpace under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership.
 *
 * DuraSpace licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fcrepo.config;

/**
 * Indicates if a JMS topic or queue is the destination
 *
 * @author pwinckles
 */
public enum JmsDestination {

    TOPIC("topic"),
    QUEUE("queue");

    private final String value;

    JmsDestination(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static JmsDestination fromString(final String value) {
        for (final var destination : values()) {
            if (destination.value.equalsIgnoreCase(value)) {
                return destination;
            }
        }
        throw new IllegalArgumentException("Unknown JMS destination: " + value);
    }

    @Override
    public String toString() {
        return value;
    }

}
