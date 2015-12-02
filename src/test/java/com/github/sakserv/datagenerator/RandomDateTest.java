package com.github.sakserv.datagenerator;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

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
 */public class RandomDateTest {

    // Logger
    private static final Logger LOG = LoggerFactory.getLogger(RandomDateTest.class);

    private static RandomDate randomDate;

    @BeforeClass
    public static void setUp() {
        randomDate = new RandomDate();
    }

    @Test
    public void testGetStartDate() throws Exception {
        assertTrue(randomDate.getStartDate().getTime() == 0l);
    }

    @Test
    public void testGetEndDate() throws Exception {
        assertTrue(randomDate.getEndDate().getTime() < System.currentTimeMillis());
    }

    @Test
    public void testGetRandomValue() throws Exception {
        assertTrue(randomDate.getStartDate().getTime() <= randomDate.getRandomValue().getTime() &&
                randomDate.getRandomValue().getTime() <= randomDate.getEndDate().getTime());
    }
}