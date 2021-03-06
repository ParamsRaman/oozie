/**
 * Copyright (c) 2010 Yahoo! Inc. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. See accompanying LICENSE file.
 */
package org.apache.oozie.service;

import org.apache.oozie.DagEngine;
import org.apache.oozie.service.Service;
import org.apache.oozie.service.Services;

/**
 * Service that return a dag engine for a user.
 */
public class DagEngineService implements Service {

    /**
     * Initialize the service.
     *
     * @param services services instance.
     */
    public void init(Services services) {
    }

    /**
     * Destroy the service.
     */
    public void destroy() {
    }

    /**
     * Return the public interface of the Dag engine service.
     *
     * @return {@link DagEngineService}.
     */
    public Class<? extends Service> getInterface() {
        return DagEngineService.class;
    }

    /**
     * Return a Dag engine.
     *
     * @param user user for the dag engine.
     * @param authToken the authentication token.
     * @return the dag engine for the specified user.
     */
    public DagEngine getDagEngine(String user, String authToken) {
        return new DagEngine(user, authToken);
    }

    /**
     * Return a Dag engine for a system user (no user, no group).
     *
     * @return a system Dag engine.
     */
    public DagEngine getSystemDagEngine() {
        return new DagEngine();
    }

}
