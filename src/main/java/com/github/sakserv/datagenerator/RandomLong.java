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

import org.apache.commons.math3.random.RandomDataGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class RandomLong implements RandomValue<Long> {

    // Logger
    private static final Logger LOG = LoggerFactory.getLogger(RandomLong.class);

    // Instance variables
    private Random random = new Random();
    private Long lowerBound;
    private Long upperBound;

    public RandomLong(Long lowerBound, Long upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Long getLowerBound() {
        return lowerBound;
    }

    public Long getUpperBound() {
        return upperBound;
    }

    @Override
    public Long getRandomValue() {
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        return randomDataGenerator.nextLong(lowerBound, upperBound);
    }

}
