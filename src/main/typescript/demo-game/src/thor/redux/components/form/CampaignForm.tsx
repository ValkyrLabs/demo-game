import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Campaign, CampaignStatusEnum,  } from '../../../model';
import { useAddCampaignMutation } from '../../services/CampaignService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Campaign
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const StatusValidation = () => { 
  return(
    [
      'planned', 'active', 'completed', 'canceled', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     campaignId: Yup.string()
    
    
    .required('campaignId is required.')
    
    ,
     name: Yup.string()
    
    
    .required('name is required.')
    
    ,
     startDate: Yup.date()
    
    
    .required('startDate is required.')
    
    ,
     endDate: Yup.date()
    
    
    .required('endDate is required.')
    
    ,
     status: Yup.string().oneOf(StatusValidation(), 'Invalid value selected for status')
    
    
    .required('status is required.')
    
    ,
     notes: Yup.string()
    
    
    
    
    ,
     budget: Yup.number()
    
    
    
    
    ,
     id: Yup.string()
    
    
    
    
    ,
     ownerId: Yup.string()
    
    
    
    
    ,
     createdDate: Yup.date()
    
    
    
    
    ,
     keyHash: Yup.string()
    
    
    
    
    ,
     lastAccessedById: Yup.string()
    
    
    
    
    ,
     lastAccessedDate: Yup.date()
    
    
    
    
    ,
     lastModifiedById: Yup.string()
    
    
    
    
    ,
     lastModifiedDate: Yup.date()
    
    
    
    
    ,

});

const CampaignForm: React.FC = () => {
  const [addCampaign, addCampaignResult] = useAddCampaignMutation();

  const initialValues: Campaign = {
    
    
    campaignId : 'null',
    
    
    
    
    
    
    
    name : 'null',
    
    
    
    
    
    
    
    
    startDate : new Date(), 
    
    
    
    
    
    
    
    endDate : new Date(), 
    
    
    
    
        status :   CampaignStatusEnum[Object.keys(CampaignStatusEnum)[0]], 
    
    
    notes : 'null',
    
    
    
    
    
    
    
    
    
    
    
    budget : 0.00, 
    
    
    
    id : 'd7b8aea6-daa5-4b59-967e-8b7187bd3c7a',
    
    
    
    
    
    
    
    ownerId : '9bfbac42-561a-472f-b258-e3cbfdeecb5a',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : 'c904dc0f-899f-46d7-8f50-42d3cb61b066',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : 'ebc2a11e-388f-4693-91e1-ff95f9ec30a8',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Campaign>) => {
    setTimeout(() => {
      console.log(values);
      addCampaign(values);
      setSubmitting(false);
    }, 500);
  }

  return (
    <div>
      <Formik
        validateOnBlur={true}
        initialValues={initialValues}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >

        {({ isSubmitting, isValid, errors, setFieldValue, touched, setFieldTouched, handleSubmit }) => (
          <form onSubmit={handleSubmit} className="form">

                    <Accordion
                      defaultActiveKey="1"
                    >
                      <Accordion.Item eventKey="0">
                        <Accordion.Header><FaCogs size={36}/></Accordion.Header>
                        <Accordion.Body>
                          errors: {JSON.stringify(errors)}
                          <br />
                          touched: {JSON.stringify(touched)}
                          <br />
                          addCampaignResult: {JSON.stringify(addCampaignResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Campaign</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="campaignId" className="nice-form-control">
              <b>Campaign Id: {touched.campaignId && !errors.campaignId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* campaignId  TEXT FIELD */}
              <Field name="campaignId" type="text"
                className={errors.campaignId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="campaignId" component="span" />
            </label>


        
            <label htmlFor="name" className="nice-form-control">
              <b>Name: {touched.name && !errors.name && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* name  TEXT FIELD */}
              <Field name="name" type="text"
                className={errors.name  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="name" component="span" />
            </label>


        
            <label htmlFor="startDate" className="nice-form-control">
              <b>Start Date: {touched.startDate && !errors.startDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*startDate DATE FIELD */}
              <Field name="startDate" type="date"
                className={errors.startDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="startDate" component="span" />
            </label>


        
            <label htmlFor="endDate" className="nice-form-control">
              <b>End Date: {touched.endDate && !errors.endDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*endDate DATE FIELD */}
              <Field name="endDate" type="date"
                className={errors.endDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="endDate" component="span" />
            </label>


        
            <label htmlFor="status" className="nice-form-control">
              <b>Status: {touched.status && !errors.status && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="status"
                className={errors.status ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('status', true);
                  setFieldValue('status', e.target.value);
                }}
              >
                <option value="" label="Select Status" />
                <StatusLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="status" component="span" />
            </label>


        
            <label htmlFor="notes" className="nice-form-control">
              <b>Notes: {touched.notes && !errors.notes && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* notes  TEXT FIELD */}
              <Field name="notes" type="text"
                className={errors.notes  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="notes" component="span" />
            </label>


        
            <label htmlFor="budget" className="nice-form-control">
              <b>Budget: {touched.budget && !errors.budget && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*budget DATE FIELD */}
              <Field name="budget" type="date"
                className={errors.budget  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="budget" component="span" />
            </label>


        
            <label htmlFor="id" className="nice-form-control">
              <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* id  TEXT FIELD */}
              <Field name="id" type="text"
                className={errors.id  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="id" component="span" />
            </label>


        
            <label htmlFor="ownerId" className="nice-form-control">
              <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* ownerId  TEXT FIELD */}
              <Field name="ownerId" type="text"
                className={errors.ownerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="ownerId" component="span" />
            </label>


        
            <label htmlFor="createdDate" className="nice-form-control">
              <b>Created Date: {touched.createdDate && !errors.createdDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*createdDate DATE FIELD */}
              <Field name="createdDate" type="date"
                className={errors.createdDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="createdDate" component="span" />
            </label>


        
            <label htmlFor="keyHash" className="nice-form-control">
              <b>Key Hash: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* keyHash  TEXT FIELD */}
              <Field name="keyHash" type="text"
                className={errors.keyHash  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="keyHash" component="span" />
            </label>


        
            <label htmlFor="lastAccessedById" className="nice-form-control">
              <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastAccessedById  TEXT FIELD */}
              <Field name="lastAccessedById" type="text"
                className={errors.lastAccessedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastAccessedById" component="span" />
            </label>


        
            <label htmlFor="lastAccessedDate" className="nice-form-control">
              <b>Last Accessed Date: {touched.lastAccessedDate && !errors.lastAccessedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastAccessedDate DATE FIELD */}
              <Field name="lastAccessedDate" type="date"
                className={errors.lastAccessedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastAccessedDate" component="span" />
            </label>


        
            <label htmlFor="lastModifiedById" className="nice-form-control">
              <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastModifiedById  TEXT FIELD */}
              <Field name="lastModifiedById" type="text"
                className={errors.lastModifiedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastModifiedById" component="span" />
            </label>


        
            <label htmlFor="lastModifiedDate" className="nice-form-control">
              <b>Last Modified Date: {touched.lastModifiedDate && !errors.lastModifiedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastModifiedDate DATE FIELD */}
              <Field name="lastModifiedDate" type="date"
                className={errors.lastModifiedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastModifiedDate" component="span" />
            </label>

 
<br /><br />

                    <CoolButton
                      variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
                      type="submit"
                      onClick={() => { }}
                    >
                      {isSubmitting && (
                        <Spinner
                          style={ { float: "left" } }
                          as="span"
                          animation="grow"
                          variant="light"
                          aria-hidden="true"
                        />
                      )}
                      <FaCheckCircle size={30} /> Create New Campaign
                    </CoolButton>


                        </Accordion.Body>
                      </Accordion.Item>
                    </Accordion>

          </form>
        )}
    </Formik>
    </div >
  );
};

/*

lowercase statuslookup
uppercase STATUSLOOKUP
snakecase status_lookup
pascalcase StatusLookup
camelcase statusLookup
kebabcase status-lookup


*/

const StatusLookup = () => { 
  return(
  <>
    
    <option value='planned' label='Planned' />
    
    
    <option value='active' label='Active' />
    
    
    <option value='completed' label='Completed' />
    
    
    <option value='canceled' label='Canceled' />
    
  </>
  )
};






export default CampaignForm;