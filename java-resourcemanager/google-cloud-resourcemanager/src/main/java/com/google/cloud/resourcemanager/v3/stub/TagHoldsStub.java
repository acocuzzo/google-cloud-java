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

package com.google.cloud.resourcemanager.v3.stub;

import static com.google.cloud.resourcemanager.v3.TagHoldsClient.ListTagHoldsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.resourcemanager.v3.CreateTagHoldMetadata;
import com.google.cloud.resourcemanager.v3.CreateTagHoldRequest;
import com.google.cloud.resourcemanager.v3.DeleteTagHoldMetadata;
import com.google.cloud.resourcemanager.v3.DeleteTagHoldRequest;
import com.google.cloud.resourcemanager.v3.ListTagHoldsRequest;
import com.google.cloud.resourcemanager.v3.ListTagHoldsResponse;
import com.google.cloud.resourcemanager.v3.TagHold;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the TagHolds service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class TagHoldsStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public OperationCallable<CreateTagHoldRequest, TagHold, CreateTagHoldMetadata>
      createTagHoldOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createTagHoldOperationCallable()");
  }

  public UnaryCallable<CreateTagHoldRequest, Operation> createTagHoldCallable() {
    throw new UnsupportedOperationException("Not implemented: createTagHoldCallable()");
  }

  public OperationCallable<DeleteTagHoldRequest, Empty, DeleteTagHoldMetadata>
      deleteTagHoldOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTagHoldOperationCallable()");
  }

  public UnaryCallable<DeleteTagHoldRequest, Operation> deleteTagHoldCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTagHoldCallable()");
  }

  public UnaryCallable<ListTagHoldsRequest, ListTagHoldsPagedResponse> listTagHoldsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTagHoldsPagedCallable()");
  }

  public UnaryCallable<ListTagHoldsRequest, ListTagHoldsResponse> listTagHoldsCallable() {
    throw new UnsupportedOperationException("Not implemented: listTagHoldsCallable()");
  }

  @Override
  public abstract void close();
}
