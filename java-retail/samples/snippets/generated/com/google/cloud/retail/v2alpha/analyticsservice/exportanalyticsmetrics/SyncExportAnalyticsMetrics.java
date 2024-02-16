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

package com.google.cloud.retail.v2alpha.samples;

// [START retail_v2alpha_generated_AnalyticsService_ExportAnalyticsMetrics_sync]
import com.google.cloud.retail.v2alpha.AnalyticsServiceClient;
import com.google.cloud.retail.v2alpha.ExportAnalyticsMetricsRequest;
import com.google.cloud.retail.v2alpha.ExportAnalyticsMetricsResponse;
import com.google.cloud.retail.v2alpha.OutputConfig;

public class SyncExportAnalyticsMetrics {

  public static void main(String[] args) throws Exception {
    syncExportAnalyticsMetrics();
  }

  public static void syncExportAnalyticsMetrics() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AnalyticsServiceClient analyticsServiceClient = AnalyticsServiceClient.create()) {
      ExportAnalyticsMetricsRequest request =
          ExportAnalyticsMetricsRequest.newBuilder()
              .setCatalog("catalog555704345")
              .setOutputConfig(OutputConfig.newBuilder().build())
              .setFilter("filter-1274492040")
              .build();
      ExportAnalyticsMetricsResponse response =
          analyticsServiceClient.exportAnalyticsMetricsAsync(request).get();
    }
  }
}
// [END retail_v2alpha_generated_AnalyticsService_ExportAnalyticsMetrics_sync]
