/*
 *     Copyright 2016-2026 TinyZ
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

package org.okraAx.login.role.module;

/**
 * 角色模块. 一个角色除了基础的角色信息外，还携带很多额外的可扩展的模块组.
 * 模块组用于装载和管理角色的扩展数据. 例如：道具,好友，任务等等
 */
public interface Module {

    /**
     * Every module has an unique id.
     * @return The module's unique id.
     */
    int id();

    /**
     * initialize module.
     */
    void init();

    /**
     * Load user's personal data.
     */
    void load();

    /**
     * Load data from any datasource or cache store.
     */
    void loadFromDB();

    /**
     * Flush data to datasource.
     */
    void flushToDB();

    /**
     * reset module and reset initialize status.
     */
    void dispose();

    /**
     * clear module's data
     */
    void clear();
}
