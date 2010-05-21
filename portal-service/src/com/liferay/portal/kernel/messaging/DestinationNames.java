/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.messaging;

/**
 * <a href="DestinationNames.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public interface DestinationNames {

	public static final String AUDIT = "liferay/audit";

	public static final String BLOGS = "liferay/blogs";

	public static final String CONVERT_PROCESS = "liferay/convert_process";

	public static final String DOCUMENT_LIBRARY_HOOK =
		"liferay/document_library_hook";

	public static final String FLAGS = "liferay/flags";

	/**
	 * This is a special destination. Binding a message listener to this
	 * destination will allow it to listen to messages sent to all destinations.
	 */
	public static final String GLOBAL = "liferay/global";

	public static final String HOT_DEPLOY = "liferay/hot_deploy";

	public static final String IP_GEOCODER = "liferay/ip_geocoder";

	public static final String IP_GEOCODER_RESPONSE =
		"liferay/ip_geocoder/response";

	public static final String JOURNAL = "liferay/journal";

	public static final String LAYOUTS_LOCAL_PUBLISHER =
		"liferay/layouts_local_publisher";

	public static final String LAYOUTS_REMOTE_PUBLISHER =
		"liferay/layouts_remote_publisher";

	public static final String LIVE_USERS = "liferay/live_users";

	public static final String MAIL = "liferay/mail";

	public static final String MAIL_SYNCHRONIZER = "liferay/mail_synchronizer";

	public static final String MESSAGE_BOARDS = "liferay/message_boards";

	public static final String MESSAGE_BOARDS_MAILING_LIST =
		"liferay/message_boards_mailing_list";

	public static final String MESSAGE_BUS_DEFAULT_RESPONSE=
		"liferay/message_bus/default_response";

	public static final String MESSAGE_BUS_MESSAGE_STATUS =
		"liferay/message_bus/message_status";

	public static final String MONITORING = "liferay/monitoring";

	public static final String POLLER = "liferay/poller";

	public static final String POLLER_RESPONSE = "liferay/poller_response";

	public static final String SCHEDULER_DISPATCH =
		"liferay/scheduler_dispatch";

	public static final String SCHEDULER_ENGINE = "liferay/scheduler_engine";

	public static final String SCHEDULER_ENGINE_RESPONSE =
		"liferay/scheduler_engine/response";

	public static final String SCRIPTING = "liferay/scripting";

	public static final String SEARCH_READER = "liferay/search_reader";

	public static final String SEARCH_READER_RESPONSE =
		"liferay/search_reader/response";

	public static final String SEARCH_WRITER = "liferay/search_writer";

	public static final String WIKI = "liferay/wiki";

	public static final String WORKFLOW_DEFINITION =
		"liferay/workflow_definition";

	public static final String WORKFLOW_ENGINE = "liferay/workflow_engine";

	public static final String WORKFLOW_INSTANCE = "liferay/workflow_instance";

	public static final String WORKFLOW_LOG = "liferay/workflow_log";

	public static final String WORKFLOW_TASK = "liferay/workflow_task";

	public static final String WSRP = "liferay/wsrp";

}