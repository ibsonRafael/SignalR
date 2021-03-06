// Copyright (c) .NET Foundation. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

package com.microsoft.aspnet.signalr;

import java.util.concurrent.CompletableFuture;

interface Transport {
    CompletableFuture start() throws Exception;
    CompletableFuture send(String message);
    void setOnReceive(OnReceiveCallBack callback);
    void onReceive(String message) throws Exception;
    CompletableFuture stop();
}
