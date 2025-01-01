
import { 
    getCampaign, 
    postCampaign,
    getCampaignList , 
    deleteCampaign , 
    updateCampaign 
} from '../../api';

import {

    ADD_CAMPAIGN_REQUEST,
    FETCH_CAMPAIGN_REQUEST,
    LIST_CAMPAIGN_REQUEST,
    UPDATE_CAMPAIGN_REQUEST,
    DELETE_CAMPAIGN_REQUEST,

    addCampaignFailure,
    addCampaignSuccess,

    fetchCampaignFailure,
    fetchCampaignSuccess,
    
    listCampaignFailure,
    listCampaignSuccess,

    updateCampaignFailure,
    updateCampaignSuccess,
    
    deleteCampaignFailure,
    deleteCampaignSuccess,
    
} from '../actions/CampaignApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Campaign
*/

export const CampaignMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Campaign MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_CAMPAIGN_REQUEST:
            try {
                const response = postCampaign(action.payload);
                dispatch(addCampaignSuccess(response.body));
            } catch (error) {
                dispatch(addCampaignFailure(error.message));
            }
            break;

        case LIST_CAMPAIGN_REQUEST:
            try {
                const response = getCampaignList();
                dispatch(listCampaignSuccess(response.body));
            } catch (error) {
                dispatch(listCampaignFailure(error.message));
            }
            break;


        case FETCH_CAMPAIGN_REQUEST:
            try {
                const response = getCampaign(action.id);
                dispatch(fetchCampaignSuccess(response.body));
            } catch (error) {
                dispatch(fetchCampaignFailure(error.message));
            }
            break;

        case UPDATE_CAMPAIGN_REQUEST:
            try {
                const { id, Campaign } = action.payload;
                const response = updateCampaign(id);
                dispatch(updateCampaignSuccess(response.body));
            } catch (error) {
                dispatch(updateCampaignFailure(error.message));
            }
            break;

        case DELETE_CAMPAIGN_REQUEST:
            try {
                const { id, Campaign } = action.payload;
                const response = deleteCampaign(id);
                dispatch(deleteCampaignSuccess(response.body));
            } catch (error) {
                dispatch(deleteCampaignFailure(error.message));
            }
            break;

        default:
            break;
    }
};

