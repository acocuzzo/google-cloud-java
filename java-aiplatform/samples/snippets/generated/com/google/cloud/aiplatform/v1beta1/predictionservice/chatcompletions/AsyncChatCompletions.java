/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_PredictionService_ChatCompletions_async]
import com.google.api.HttpBody;
import com.google.api.gax.rpc.ServerStream;
import com.google.cloud.aiplatform.v1beta1.ChatCompletionsRequest;
import com.google.cloud.aiplatform.v1beta1.EndpointName;
import com.google.cloud.aiplatform.v1beta1.PredictionServiceClient;

public class AsyncChatCompletions {

  public static void main(String[] args) throws Exception {
    asyncChatCompletions();
  }

  public static void asyncChatCompletions() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
      ChatCompletionsRequest request =
          ChatCompletionsRequest.newBuilder()
              .setEndpoint(
                  EndpointName.ofProjectLocationEndpointName(
                          "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
                      .toString())
              .setHttpBody(HttpBody.newBuilder().build())
              .build();
      ServerStream<HttpBody> stream =
          predictionServiceClient.chatCompletionsCallable().call(request);
      for (HttpBody response : stream) {
        // Do something when a response is received.
      }
    }
  }
}
// [END aiplatform_v1beta1_generated_PredictionService_ChatCompletions_async]
