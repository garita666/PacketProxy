/*
 * Copyright 2022 DeNA Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package packetproxy.quic.value.transportparameter;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

import java.nio.ByteBuffer;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Value
public class UnknownParameter extends TransportParameter {
    static public final long ID = 0xdeadbeefL;

    public UnknownParameter(ByteBuffer buffer) {
        super(buffer);
    }

    public UnknownParameter(byte[] unknownBytes) {
        super(ID, unknownBytes.length, unknownBytes);
    }
    public byte[] getValue() {
        return super.parameterValue;
    }

}