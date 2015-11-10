/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.sakserv.datagenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomFloat implements RandomValue<Float> {

    // Logger
    private static final Logger LOG = LoggerFactory.getLogger(RandomFloat.class);

    // Instance Variables
    private Random random = new Random();
    private Integer precision;

    public RandomFloat(Integer precision) {
        this.precision = precision;
    }

    public Integer getPrecision() {
        return precision;
    }

    public Float getRandomValue() {
        return Float.parseFloat(String.format("%." + precision + "f", random.nextFloat()));
    }
}
