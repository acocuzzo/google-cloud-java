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

package com.google.cloud.tpu.v2alpha1.samples;

// [START tpu_v2alpha1_generated_Tpu_SimulateMaintenanceEvent_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.tpu.v2alpha1.Node;
import com.google.cloud.tpu.v2alpha1.NodeName;
import com.google.cloud.tpu.v2alpha1.OperationMetadata;
import com.google.cloud.tpu.v2alpha1.SimulateMaintenanceEventRequest;
import com.google.cloud.tpu.v2alpha1.TpuClient;
import java.util.ArrayList;

public class AsyncSimulateMaintenanceEventLRO {

  public static void main(String[] args) throws Exception {
    asyncSimulateMaintenanceEventLRO();
  }

  public static void asyncSimulateMaintenanceEventLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TpuClient tpuClient = TpuClient.create()) {
      SimulateMaintenanceEventRequest request =
          SimulateMaintenanceEventRequest.newBuilder()
              .setName(NodeName.of("[PROJECT]", "[LOCATION]", "[NODE]").toString())
              .addAllWorkerIds(new ArrayList<String>())
              .build();
      OperationFuture<Node, OperationMetadata> future =
          tpuClient.simulateMaintenanceEventOperationCallable().futureCall(request);
      // Do something.
      Node response = future.get();
    }
  }
}
// [END tpu_v2alpha1_generated_Tpu_SimulateMaintenanceEvent_LRO_async]
