
import { 
    getChatMessage, 
    postChatMessage,
    getChatMessageList , 
    deleteChatMessage , 
    updateChatMessage 
} from '../../api';

import {

    ADD_CHATMESSAGE_REQUEST,
    FETCH_CHATMESSAGE_REQUEST,
    LIST_CHATMESSAGE_REQUEST,
    UPDATE_CHATMESSAGE_REQUEST,
    DELETE_CHATMESSAGE_REQUEST,

    addChatMessageFailure,
    addChatMessageSuccess,

    fetchChatMessageFailure,
    fetchChatMessageSuccess,
    
    listChatMessageFailure,
    listChatMessageSuccess,

    updateChatMessageFailure,
    updateChatMessageSuccess,
    
    deleteChatMessageFailure,
    deleteChatMessageSuccess,
    
} from '../actions/ChatMessageApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: ChatMessage
*/

export const ChatMessageMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("ChatMessage MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_CHATMESSAGE_REQUEST:
            try {
                const response = postChatMessage(action.payload);
                dispatch(addChatMessageSuccess(response.body));
            } catch (error) {
                dispatch(addChatMessageFailure(error.message));
            }
            break;

        case LIST_CHATMESSAGE_REQUEST:
            try {
                const response = getChatMessageList();
                dispatch(listChatMessageSuccess(response.body));
            } catch (error) {
                dispatch(listChatMessageFailure(error.message));
            }
            break;


        case FETCH_CHATMESSAGE_REQUEST:
            try {
                const response = getChatMessage(action.id);
                dispatch(fetchChatMessageSuccess(response.body));
            } catch (error) {
                dispatch(fetchChatMessageFailure(error.message));
            }
            break;

        case UPDATE_CHATMESSAGE_REQUEST:
            try {
                const { id, ChatMessage } = action.payload;
                const response = updateChatMessage(id);
                dispatch(updateChatMessageSuccess(response.body));
            } catch (error) {
                dispatch(updateChatMessageFailure(error.message));
            }
            break;

        case DELETE_CHATMESSAGE_REQUEST:
            try {
                const { id, ChatMessage } = action.payload;
                const response = deleteChatMessage(id);
                dispatch(deleteChatMessageSuccess(response.body));
            } catch (error) {
                dispatch(deleteChatMessageFailure(error.message));
            }
            break;

        default:
            break;
    }
};
