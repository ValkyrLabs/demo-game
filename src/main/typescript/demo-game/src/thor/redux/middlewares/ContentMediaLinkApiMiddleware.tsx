
import { 
    getContentMediaLink, 
    postContentMediaLink,
    getContentMediaLinkList , 
    deleteContentMediaLink , 
    updateContentMediaLink 
} from '../../api';

import {

    ADD_CONTENTMEDIALINK_REQUEST,
    FETCH_CONTENTMEDIALINK_REQUEST,
    LIST_CONTENTMEDIALINK_REQUEST,
    UPDATE_CONTENTMEDIALINK_REQUEST,
    DELETE_CONTENTMEDIALINK_REQUEST,

    addContentMediaLinkFailure,
    addContentMediaLinkSuccess,

    fetchContentMediaLinkFailure,
    fetchContentMediaLinkSuccess,
    
    listContentMediaLinkFailure,
    listContentMediaLinkSuccess,

    updateContentMediaLinkFailure,
    updateContentMediaLinkSuccess,
    
    deleteContentMediaLinkFailure,
    deleteContentMediaLinkSuccess,
    
} from '../actions/ContentMediaLinkApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: ContentMediaLink
*/

export const ContentMediaLinkMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("ContentMediaLink MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_CONTENTMEDIALINK_REQUEST:
            try {
                const response = postContentMediaLink(action.payload);
                dispatch(addContentMediaLinkSuccess(response.body));
            } catch (error) {
                dispatch(addContentMediaLinkFailure(error.message));
            }
            break;

        case LIST_CONTENTMEDIALINK_REQUEST:
            try {
                const response = getContentMediaLinkList();
                dispatch(listContentMediaLinkSuccess(response.body));
            } catch (error) {
                dispatch(listContentMediaLinkFailure(error.message));
            }
            break;


        case FETCH_CONTENTMEDIALINK_REQUEST:
            try {
                const response = getContentMediaLink(action.id);
                dispatch(fetchContentMediaLinkSuccess(response.body));
            } catch (error) {
                dispatch(fetchContentMediaLinkFailure(error.message));
            }
            break;

        case UPDATE_CONTENTMEDIALINK_REQUEST:
            try {
                const { id, ContentMediaLink } = action.payload;
                const response = updateContentMediaLink(id);
                dispatch(updateContentMediaLinkSuccess(response.body));
            } catch (error) {
                dispatch(updateContentMediaLinkFailure(error.message));
            }
            break;

        case DELETE_CONTENTMEDIALINK_REQUEST:
            try {
                const { id, ContentMediaLink } = action.payload;
                const response = deleteContentMediaLink(id);
                dispatch(deleteContentMediaLinkSuccess(response.body));
            } catch (error) {
                dispatch(deleteContentMediaLinkFailure(error.message));
            }
            break;

        default:
            break;
    }
};

