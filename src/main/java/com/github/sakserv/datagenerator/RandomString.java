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

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomString implements RandomValue<String> {

    // Logger
    private static final Logger LOG = LoggerFactory.getLogger(RandomString.class);

    // Instance variables
    private Random random = new Random();
    private File dictionaryFile;
    private List<String> dictionaryFileContents;

    public RandomString(File dictionaryFile) {
        this.dictionaryFile = dictionaryFile;
        setDictionaryFileContents(dictionaryFile);
    }

    public File getDictionaryFile() {
        return dictionaryFile;
    }

    private void setDictionaryFileContents(File dictionaryFile) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(dictionaryFile.getName());
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        dictionaryFileContents = new ArrayList<>();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                dictionaryFileContents.add(line);
            }
        } catch (IOException e) {
            LOG.error("Failed to read contents of {}", dictionaryFile.getAbsolutePath());
            e.printStackTrace();
        }
    }

    @Override
    public String getRandomValue() {
        return dictionaryFileContents.get(random.nextInt(dictionaryFileContents.size()));
    }
}
