// tslint:disable

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apis.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: ChatMessageApi
*/

import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../src/runtime';
import {
    ChatMessage,
    ChatMessageFromJSON,
    ChatMessageToJSON,
} from '../model';

export interface DeleteChatMessageRequest {
    id: string;
}

export interface GetChatMessageRequest {
    id: string;
}

export interface PostChatMessageRequest {
    chatMessage: ChatMessage;
}

export interface UpdateChatMessageRequest {
    id: string;
    chatMessage: ChatMessage;
}


/**
 * Deletes a specific ChatMessage.
 * Delete a ChatMessage.
 */
function deleteChatMessageRaw<T>(requestParameters: DeleteChatMessageRequest, requestConfig: runtime.TypedQueryConfig<T, void> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteChatMessage.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ChatMessage/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'DELETE',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
    }

    return config;
}

/**
* Deletes a specific ChatMessage.
* Delete a ChatMessage.
*/
export function deleteChatMessage<T>(requestParameters: DeleteChatMessageRequest, requestConfig?: runtime.TypedQueryConfig<T, void>): QueryConfig<T> {
    return deleteChatMessageRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a single ChatMessage for a specific uid.
 * Retrieve a single ChatMessage
 */
function getChatMessageRaw<T>(requestParameters: GetChatMessageRequest, requestConfig: runtime.TypedQueryConfig<T, ChatMessage> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getChatMessage.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ChatMessage/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ChatMessageFromJSON(body), text);
    }

    return config;
}

/**
* Retrieves a single ChatMessage for a specific uid.
* Retrieve a single ChatMessage
*/
export function getChatMessage<T>(requestParameters: GetChatMessageRequest, requestConfig?: runtime.TypedQueryConfig<T, ChatMessage>): QueryConfig<T> {
    return getChatMessageRaw(requestParameters, requestConfig);
}

/**
 * Retrieves a list of ChatMessages.
 * Retrieve a list of ChatMessages
 */
function getChatMessageListRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Array<ChatMessage>> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ChatMessage`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(ChatMessageFromJSON), text);
    }

    return config;
}

/**
* Retrieves a list of ChatMessages.
* Retrieve a list of ChatMessages
*/
export function getChatMessageList<T>( requestConfig?: runtime.TypedQueryConfig<T, Array<ChatMessage>>): QueryConfig<T> {
    return getChatMessageListRaw( requestConfig);
}

/**
 * Creates a new ChatMessage.
 * Create a new ChatMessage
 */
function postChatMessageRaw<T>(requestParameters: PostChatMessageRequest, requestConfig: runtime.TypedQueryConfig<T, ChatMessage> = {}): QueryConfig<T> {
    if (requestParameters.chatMessage === null || requestParameters.chatMessage === undefined) {
        throw new runtime.RequiredError('chatMessage','Required parameter requestParameters.chatMessage was null or undefined when calling postChatMessage.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ChatMessage`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters || ChatMessageToJSON(requestParameters.chatMessage),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ChatMessageFromJSON(body), text);
    }

    return config;
}

/**
* Creates a new ChatMessage.
* Create a new ChatMessage
*/
export function postChatMessage<T>(requestParameters: PostChatMessageRequest, requestConfig?: runtime.TypedQueryConfig<T, ChatMessage>): QueryConfig<T> {
    return postChatMessageRaw(requestParameters, requestConfig);
}

/**
 * Updates an existing ChatMessage.
 * Update an existing ChatMessage
 */
function updateChatMessageRaw<T>(requestParameters: UpdateChatMessageRequest, requestConfig: runtime.TypedQueryConfig<T, ChatMessage> = {}): QueryConfig<T> {
    if (requestParameters.id === null || requestParameters.id === undefined) {
        throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling updateChatMessage.');
    }

    if (requestParameters.chatMessage === null || requestParameters.chatMessage === undefined) {
        throw new runtime.RequiredError('chatMessage','Required parameter requestParameters.chatMessage was null or undefined when calling updateChatMessage.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ChatMessage/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'PUT',
            headers: headerParameters,
        },
        body: queryParameters || ChatMessageToJSON(requestParameters.chatMessage),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ChatMessageFromJSON(body), text);
    }

    return config;
}

/**
* Updates an existing ChatMessage.
* Update an existing ChatMessage
*/
export function updateChatMessage<T>(requestParameters: UpdateChatMessageRequest, requestConfig?: runtime.TypedQueryConfig<T, ChatMessage>): QueryConfig<T> {
    return updateChatMessageRaw(requestParameters, requestConfig);
}
