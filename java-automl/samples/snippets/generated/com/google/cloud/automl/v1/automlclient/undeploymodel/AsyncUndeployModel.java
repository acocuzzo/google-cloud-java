/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.automl.v1.samples;

// [START automl_v1_generated_automlclient_undeploymodel_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.automl.v1.AutoMlClient;
import com.google.cloud.automl.v1.ModelName;
import com.google.cloud.automl.v1.UndeployModelRequest;
import com.google.longrunning.Operation;

public class AsyncUndeployModel {

  public static void main(String[] args) throws Exception {
    asyncUndeployModel();
  }

  public static void asyncUndeployModel() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (AutoMlClient autoMlClient = AutoMlClient.create()) {
      UndeployModelRequest request =
          UndeployModelRequest.newBuilder()
              .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
              .build();
      ApiFuture<Operation> future = autoMlClient.undeployModelCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END automl_v1_generated_automlclient_undeploymodel_async]
