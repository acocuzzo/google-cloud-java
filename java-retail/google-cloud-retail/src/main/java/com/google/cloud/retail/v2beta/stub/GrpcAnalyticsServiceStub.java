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

package com.google.cloud.retail.v2beta.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.retail.v2beta.ExportAnalyticsMetricsRequest;
import com.google.cloud.retail.v2beta.ExportAnalyticsMetricsResponse;
import com.google.cloud.retail.v2beta.ExportMetadata;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the AnalyticsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcAnalyticsServiceStub extends AnalyticsServiceStub {
  private static final MethodDescriptor<ExportAnalyticsMetricsRequest, Operation>
      exportAnalyticsMetricsMethodDescriptor =
          MethodDescriptor.<ExportAnalyticsMetricsRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.retail.v2beta.AnalyticsService/ExportAnalyticsMetrics")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ExportAnalyticsMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private final UnaryCallable<ExportAnalyticsMetricsRequest, Operation>
      exportAnalyticsMetricsCallable;
  private final OperationCallable<
          ExportAnalyticsMetricsRequest, ExportAnalyticsMetricsResponse, ExportMetadata>
      exportAnalyticsMetricsOperationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAnalyticsServiceStub create(AnalyticsServiceStubSettings settings)
      throws IOException {
    return new GrpcAnalyticsServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAnalyticsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAnalyticsServiceStub(
        AnalyticsServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAnalyticsServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAnalyticsServiceStub(
        AnalyticsServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAnalyticsServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAnalyticsServiceStub(
      AnalyticsServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAnalyticsServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAnalyticsServiceStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcAnalyticsServiceStub(
      AnalyticsServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ExportAnalyticsMetricsRequest, Operation>
        exportAnalyticsMetricsTransportSettings =
            GrpcCallSettings.<ExportAnalyticsMetricsRequest, Operation>newBuilder()
                .setMethodDescriptor(exportAnalyticsMetricsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("catalog", String.valueOf(request.getCatalog()));
                      return builder.build();
                    })
                .build();

    this.exportAnalyticsMetricsCallable =
        callableFactory.createUnaryCallable(
            exportAnalyticsMetricsTransportSettings,
            settings.exportAnalyticsMetricsSettings(),
            clientContext);
    this.exportAnalyticsMetricsOperationCallable =
        callableFactory.createOperationCallable(
            exportAnalyticsMetricsTransportSettings,
            settings.exportAnalyticsMetricsOperationSettings(),
            clientContext,
            operationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ExportAnalyticsMetricsRequest, Operation> exportAnalyticsMetricsCallable() {
    return exportAnalyticsMetricsCallable;
  }

  @Override
  public OperationCallable<
          ExportAnalyticsMetricsRequest, ExportAnalyticsMetricsResponse, ExportMetadata>
      exportAnalyticsMetricsOperationCallable() {
    return exportAnalyticsMetricsOperationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
