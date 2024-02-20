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

package com.google.cloud.talent.v4beta1.samples;

// [START jobs_v4beta1_generated_JobService_BatchUpdateJobs_TenantnameListjob_sync]
import com.google.cloud.talent.v4beta1.Job;
import com.google.cloud.talent.v4beta1.JobOperationResult;
import com.google.cloud.talent.v4beta1.JobServiceClient;
import com.google.cloud.talent.v4beta1.TenantName;
import java.util.ArrayList;
import java.util.List;

public class SyncBatchUpdateJobsTenantnameListjob {

  public static void main(String[] args) throws Exception {
    syncBatchUpdateJobsTenantnameListjob();
  }

  public static void syncBatchUpdateJobsTenantnameListjob() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
      TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
      List<Job> jobs = new ArrayList<>();
      JobOperationResult response = jobServiceClient.batchUpdateJobsAsync(parent, jobs).get();
    }
  }
}
// [END jobs_v4beta1_generated_JobService_BatchUpdateJobs_TenantnameListjob_sync]
