/**
 * Copyright 2015-2016 Maven Source Dependencies
 * Plugin contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.srcdeps.core.config;

import java.lang.reflect.Field;

/**
 * A visitor that gets called for every field of the node object that is being traversed.
 *
 * @author <a href="https://github.com/ppalaga">Peter Palaga</a>
 */
public interface ConfigurationNodeVisitor {

    /**
     * Visit the given field of the given node object.
     *
     * @param node the object the given {@code field} belongs to
     * @param field the field to traverse
     */
    void visit(Object node, Field field);
}