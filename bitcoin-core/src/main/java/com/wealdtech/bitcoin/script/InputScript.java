/*
 *    Copyright 2013 Weald Technology Trading Limited
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.wealdtech.bitcoin.script;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple script to provide signatures for an existing transaction
 */
public class InputScript
{
  // TODO change the inputs to objects
  public static Script create(final byte[] signature, final byte[] pubkey)
  {
    List<Op> ops = new ArrayList<>();
    ops.add(new Op(signature));
    ops.add(new Op(pubkey));

    return new Script(ops);
  }
}
