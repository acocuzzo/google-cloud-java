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

package com.google.cloud.telcoautomation.v1.samples;

// [START telcoautomation_v1_generated_TelcoAutomation_CreateDeployment_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.telcoautomation.v1.CreateDeploymentRequest;
import com.google.cloud.telcoautomation.v1.Deployment;
import com.google.cloud.telcoautomation.v1.OrchestrationClusterName;
import com.google.cloud.telcoautomation.v1.TelcoAutomationClient;

public class AsyncCreateDeployment {

  public static void main(String[] args) throws Exception {
    asyncCreateDeployment();
  }

  public static void asyncCreateDeployment() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TelcoAutomationClient telcoAutomationClient = TelcoAutomationClient.create()) {
      CreateDeploymentRequest request =
          CreateDeploymentRequest.newBuilder()
              .setParent(
                  OrchestrationClusterName.of("[PROJECT]", "[LOCATION]", "[ORCHESTRATION_CLUSTER]")
                      .toString())
              .setDeploymentId("deploymentId-136894784")
              .setDeployment(Deployment.newBuilder().build())
              .build();
      ApiFuture<Deployment> future =
          telcoAutomationClient.createDeploymentCallable().futureCall(request);
      // Do something.
      Deployment response = future.get();
    }
  }
}
// [END telcoautomation_v1_generated_TelcoAutomation_CreateDeployment_async]
