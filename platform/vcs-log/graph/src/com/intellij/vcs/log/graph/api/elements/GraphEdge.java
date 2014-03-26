/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intellij.vcs.log.graph.api.elements;

import org.jetbrains.annotations.NotNull;

public class GraphEdge implements GraphElement {
  private final int myUpNodeIndex;
  private final int myDownNodeIndex;
  @NotNull
  private final Type myType;

  public GraphEdge(int upNodeIndex, int downNodeIndex, @NotNull Type type) {
    myUpNodeIndex = upNodeIndex;
    myDownNodeIndex = downNodeIndex;
    myType = type;
  }

  public int getUpNodeIndex() {
    return myUpNodeIndex;
  }

  public int getDownNodeIndex() {
    return myDownNodeIndex;
  }

  @NotNull
  public Type getType() {
    return myType;
  }

  public enum Type {
    USUAL,
    HIDE
  }
}
