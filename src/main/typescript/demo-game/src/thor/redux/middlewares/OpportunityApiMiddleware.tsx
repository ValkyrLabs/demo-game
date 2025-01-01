
import { 
    getOpportunity, 
    postOpportunity,
    getOpportunityList , 
    deleteOpportunity , 
    updateOpportunity 
} from '../../api';

import {

    ADD_OPPORTUNITY_REQUEST,
    FETCH_OPPORTUNITY_REQUEST,
    LIST_OPPORTUNITY_REQUEST,
    UPDATE_OPPORTUNITY_REQUEST,
    DELETE_OPPORTUNITY_REQUEST,

    addOpportunityFailure,
    addOpportunitySuccess,

    fetchOpportunityFailure,
    fetchOpportunitySuccess,
    
    listOpportunityFailure,
    listOpportunitySuccess,

    updateOpportunityFailure,
    updateOpportunitySuccess,
    
    deleteOpportunityFailure,
    deleteOpportunitySuccess,
    
} from '../actions/OpportunityApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Opportunity
*/

export const OpportunityMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Opportunity MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OPPORTUNITY_REQUEST:
            try {
                const response = postOpportunity(action.payload);
                dispatch(addOpportunitySuccess(response.body));
            } catch (error) {
                dispatch(addOpportunityFailure(error.message));
            }
            break;

        case LIST_OPPORTUNITY_REQUEST:
            try {
                const response = getOpportunityList();
                dispatch(listOpportunitySuccess(response.body));
            } catch (error) {
                dispatch(listOpportunityFailure(error.message));
            }
            break;


        case FETCH_OPPORTUNITY_REQUEST:
            try {
                const response = getOpportunity(action.id);
                dispatch(fetchOpportunitySuccess(response.body));
            } catch (error) {
                dispatch(fetchOpportunityFailure(error.message));
            }
            break;

        case UPDATE_OPPORTUNITY_REQUEST:
            try {
                const { id, Opportunity } = action.payload;
                const response = updateOpportunity(id);
                dispatch(updateOpportunitySuccess(response.body));
            } catch (error) {
                dispatch(updateOpportunityFailure(error.message));
            }
            break;

        case DELETE_OPPORTUNITY_REQUEST:
            try {
                const { id, Opportunity } = action.payload;
                const response = deleteOpportunity(id);
                dispatch(deleteOpportunitySuccess(response.body));
            } catch (error) {
                dispatch(deleteOpportunityFailure(error.message));
            }
            break;

        default:
            break;
    }
};
