/*
 * Copyright 2013 Xi CHEN
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.seanchenxi.gwt.webrtc.client.data;

import com.google.gwt.dom.client.NativeEvent;
import com.seanchenxi.gwt.html.client.BinaryType;

/**
 * User: Xi
 */
public class MessageEventNative extends NativeEvent {

    protected MessageEventNative() {
    }

    public final BinaryType getDataType(){
        return BinaryType.findType(getData());
    }

    public final native Object getData() /*-{
        return this.data;
    }-*/;



}
