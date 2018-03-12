/*
 *   Copyright (C) 2005-2016 Alfresco Software Limited.
 *
 *   This file is part of Alfresco Java Client.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.alfresco.client.api.tests.core;

import com.alfresco.client.api.AlfrescoAPITestCase;
import com.alfresco.client.api.core.DictionaryAPI;
import com.alfresco.client.api.core.model.representation.DictionaryClassRepresentation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class DictionaryApiTest extends AlfrescoAPITestCase {
    @BeforeClass
    public void prepare() throws Exception {
        client = prepareClient(TEST_ENDPOINT, TEST_USERNAME, TEST_PASSWORD);
    }

    @Test
    public void retrieveDictionary() throws IOException {
        DictionaryAPI dictionaryAPI = client.getDictionaryAPI();

        // get specific class information
        Response<DictionaryClassRepresentation> response = dictionaryAPI.getClass("download_download")
                .execute();

        System.out.println(response.body().getParentType().getUrl());
        System.out.println(response.body().getDefaultAspects().keySet());
        System.out.println(response.body().getProperties().keySet());
        System.out.println(response.body().getProperties().get("cm:name").getDataType());


        Response<List<DictionaryClassRepresentation>> response2 = dictionaryAPI.getClasses()
                .execute();

        for (DictionaryClassRepresentation entry : response2.body()) {
            System.out.println(entry.getName());
        }

    }
}
