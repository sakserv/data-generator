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

import java.sql.Time;
import java.sql.Timestamp;
import java.text.*;
import java.util.Date;
import java.util.Random;

public class RandomDate implements RandomValue<Date> {

    // Logger
    private static final Logger LOG = LoggerFactory.getLogger(RandomDate.class);

    // Variables
    private Date startDate;
    private Date endDate;

    public RandomDate() {
        this(new Date(Long.parseLong("0")), new Date(System.currentTimeMillis()));
    }

    public RandomDate(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Date getRandomValue() {
        RandomLong randomLong = new RandomLong(startDate.getTime(), endDate.getTime());
        return new Date(randomLong.getRandomValue());
    }
}
