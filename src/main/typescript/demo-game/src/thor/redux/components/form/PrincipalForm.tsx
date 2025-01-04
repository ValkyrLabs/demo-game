import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Principal,  } from '../../../model';
import { useAddPrincipalMutation } from '../../services/PrincipalService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2025-01-03T16:22:47.869548-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Principal
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     username: Yup.string()
    
    
    .required('username is required.')
    
    ,
     password: Yup.string()
    
    
    .required('password is required.')
    
    ,
     email: Yup.string()
    .email()
    
    .required('email is required.')
    
    .matches( /^.+@[^.].*.[a-z]{2,}$/, 'email must match the provided pattern The main email address for the user (encrypted)' ),
     firstName: Yup.string()
    
    
    
    
    ,
     middleName: Yup.string()
    
    
    
    
    ,
     lastName: Yup.string()
    
    
    
    
    ,
     fingerprint: Yup.string()
    
    
    
    
    ,
     federalIdentification: Yup.string()
    
    
    
    
    .matches( /^\\d{3}-\\d{2}-\\d{4}$/, 'federalIdentification must match the provided pattern SSN or a 10 digit federal government ID (encrypted)' ),
     residenceCountry: Yup.string()
    
    
    
    
    ,
     stateIdentification: Yup.string()
    
    
    
    
    .matches( /^\\d{10}$/, 'stateIdentification must match the provided pattern Driver\&#39;s License or a 10 digit state government ID' ),
     residenceState: Yup.string()
    
    
    
    
    ,
     social: Yup.string()
    
    
    
    
    ,
     bio: Yup.string()
    
    
    
    
    ,
     notes: Yup.string()
    
    
    
    
    ,
     avatarUrl: Yup.string()
    
    
    
    
    ,
     organizationId: Yup.string()
    
    
    
    
    ,
        acceptedCookies: Yup.boolean()
    
    .oneOf([true], "The acceptedCookies value must be true.")
    
    
    ,
    acceptedTos: Yup.boolean()
    
    .oneOf([true], "The acceptedTos value must be true.")
    
    
    ,
    enabled: Yup.boolean()
    
    .oneOf([true], "The enabled value must be true.")
    
    
    ,
    credentialNonExpired: Yup.boolean()
    
    .oneOf([true], "The credentialNonExpired value must be true.")
    
    
    ,
    accountEnabled: Yup.boolean()
    
    .oneOf([true], "The accountEnabled value must be true.")
    
    
    ,
    accountNonLocked: Yup.boolean()
    
    .oneOf([true], "The accountNonLocked value must be true.")
    
    
    ,
    accountNonExpired: Yup.boolean()
    
    .oneOf([true], "The accountNonExpired value must be true.")
    
    
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

const PrincipalForm: React.FC = () => {
  const [addPrincipal, addPrincipalResult] = useAddPrincipalMutation();

  const initialValues: Principal = {
    
    
    username : 'Sparky',
    
    
    
    
    
    
    
    password : 'HardToGuess1980',
    
    
    
    
    
    
    
    email : 'wiley.coyote@acme-corp.com',
    
    
    
    
    
    
    
    firstName : 'Peace',
    
    
    
    
    
    
    
    middleName : 'Love',
    
    
    
    
    
    
    
    lastName : 'Harmony',
    
    
    
    
    
    
    
    fingerprint : 'DK$DFSJaraDD',
    
    
    
    
    
    
    
    federalIdentification : '111-22-3333',
    
    
    
    
    
    
    
    residenceCountry : 'USA',
    
    
    
    
    
    
    
    stateIdentification : '3333333333',
    
    
    
    
    
    
    
    residenceState : 'CA',
    
    
    
    
    
    
    
    social : 'https://twitter.com/ValkyrAI',
    
    
    
    
    
    
    
    bio : 'null',
    
    
    
    
    
    
    
    notes : 'Notes about this account',
    
    
    
    
    
    
    
    avatarUrl : 'https://img.com/mypic.png',
    
    
    
    
    
    
    
    organizationId : 'null',
    
    
    
    
    
    
    acceptedCookies : false,
    
    
    
    
    
    
    
    acceptedTos : false,
    
    
    
    
    
    
    
    enabled : true,
    
    
    
    
    
    
    
    credentialNonExpired : true,
    
    
    
    
    
    
    
    accountEnabled : true,
    
    
    
    
    
    
    
    accountNonLocked : true,
    
    
    
    
    
    
    
    accountNonExpired : false,
    
    
    
    
    
    
    
    
    id : 'c62b9065-3bc5-445c-88ee-efeee05f207c',
    
    
    
    
    
    
    
    ownerId : 'ed29628e-caf1-419f-9985-f8ecc6394b1e',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : '1417708a-45ad-43cd-a294-521766640255',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : 'b3bcecd5-3344-46c0-90c5-f1bfabee65b6',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Principal>) => {
    setTimeout(() => {
      console.log(values);
      addPrincipal(values);
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
                          addPrincipalResult: {JSON.stringify(addPrincipalResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Principal</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="username" className="nice-form-control">
              <b>Username: {touched.username && !errors.username && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* username  TEXT FIELD */}
              <Field name="username" type="text"
                className={errors.username  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="username" component="span" />
            </label>


        
            <label htmlFor="password" className="nice-form-control">
              <b>Password: {touched.password && !errors.password && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* password  TEXT FIELD */}
              <Field name="password" type="text"
                className={errors.password  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="password" component="span" />
            </label>


        
            <label htmlFor="email" className="nice-form-control">
              <b>Email: {touched.email && !errors.email && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* email  TEXT FIELD */}
              <Field name="email" type="text"
                className={errors.email  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="email" component="span" />
            </label>


        
            <label htmlFor="firstName" className="nice-form-control">
              <b>First Name: {touched.firstName && !errors.firstName && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* firstName  TEXT FIELD */}
              <Field name="firstName" type="text"
                className={errors.firstName  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="firstName" component="span" />
            </label>


        
            <label htmlFor="middleName" className="nice-form-control">
              <b>Middle Name: {touched.middleName && !errors.middleName && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* middleName  TEXT FIELD */}
              <Field name="middleName" type="text"
                className={errors.middleName  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="middleName" component="span" />
            </label>


        
            <label htmlFor="lastName" className="nice-form-control">
              <b>Last Name: {touched.lastName && !errors.lastName && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastName  TEXT FIELD */}
              <Field name="lastName" type="text"
                className={errors.lastName  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastName" component="span" />
            </label>


        
            <label htmlFor="fingerprint" className="nice-form-control">
              <b>Fingerprint: {touched.fingerprint && !errors.fingerprint && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* fingerprint  TEXT FIELD */}
              <Field name="fingerprint" type="text"
                className={errors.fingerprint  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="fingerprint" component="span" />
            </label>


        
            <label htmlFor="federalIdentification" className="nice-form-control">
              <b>Federal Identification: {touched.federalIdentification && !errors.federalIdentification && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* federalIdentification  TEXT FIELD */}
              <Field name="federalIdentification" type="text"
                className={errors.federalIdentification  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="federalIdentification" component="span" />
            </label>


        
            <label htmlFor="residenceCountry" className="nice-form-control">
              <b>Residence Country: {touched.residenceCountry && !errors.residenceCountry && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* residenceCountry  TEXT FIELD */}
              <Field name="residenceCountry" type="text"
                className={errors.residenceCountry  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="residenceCountry" component="span" />
            </label>


        
            <label htmlFor="stateIdentification" className="nice-form-control">
              <b>State Identification: {touched.stateIdentification && !errors.stateIdentification && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* stateIdentification  TEXT FIELD */}
              <Field name="stateIdentification" type="text"
                className={errors.stateIdentification  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="stateIdentification" component="span" />
            </label>


        
            <label htmlFor="residenceState" className="nice-form-control">
              <b>Residence State: {touched.residenceState && !errors.residenceState && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* residenceState  TEXT FIELD */}
              <Field name="residenceState" type="text"
                className={errors.residenceState  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="residenceState" component="span" />
            </label>


        
            <label htmlFor="social" className="nice-form-control">
              <b>Social: {touched.social && !errors.social && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* social  TEXT FIELD */}
              <Field name="social" type="text"
                className={errors.social  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="social" component="span" />
            </label>


        
            <label htmlFor="bio" className="nice-form-control">
              <b>Bio: {touched.bio && !errors.bio && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* bio  TEXT FIELD */}
              <Field name="bio" type="text"
                className={errors.bio  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="bio" component="span" />
            </label>


        
            <label htmlFor="notes" className="nice-form-control">
              <b>Notes: {touched.notes && !errors.notes && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* notes  TEXT FIELD */}
              <Field name="notes" type="text"
                className={errors.notes  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="notes" component="span" />
            </label>


        
            <label htmlFor="avatarUrl" className="nice-form-control">
              <b>Avatar Url: {touched.avatarUrl && !errors.avatarUrl && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* avatarUrl  TEXT FIELD */}
              <Field name="avatarUrl" type="text"
                className={errors.avatarUrl  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="avatarUrl" component="span" />
            </label>


        
            <label htmlFor="organizationId" className="nice-form-control">
              <b>Organization Id: {touched.organizationId && !errors.organizationId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* organizationId  TEXT FIELD */}
              <Field name="organizationId" type="text"
                className={errors.organizationId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="organizationId" component="span" />
            </label>


        
            <label htmlFor="acceptedCookies" className="nice-form-control">
              <b>Accepted Cookies: {touched.acceptedCookies && !errors.acceptedCookies && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="acceptedCookies"
                name="acceptedCookies"
                onChange={e => {
                  setFieldTouched('acceptedCookies', true);
                  setFieldValue('acceptedCookies', e.target.checked);
                }}
                isInvalid={!!errors.acceptedCookies }                  
                className={errors.acceptedCookies  ? 'error ' : ''} />
              <ErrorMessage className='error' name="acceptedCookies" component="span" />
            </label>


        
            <label htmlFor="acceptedTos" className="nice-form-control">
              <b>Accepted Tos: {touched.acceptedTos && !errors.acceptedTos && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="acceptedTos"
                name="acceptedTos"
                onChange={e => {
                  setFieldTouched('acceptedTos', true);
                  setFieldValue('acceptedTos', e.target.checked);
                }}
                isInvalid={!!errors.acceptedTos }                  
                className={errors.acceptedTos  ? 'error ' : ''} />
              <ErrorMessage className='error' name="acceptedTos" component="span" />
            </label>


        
            <label htmlFor="enabled" className="nice-form-control">
              <b>Enabled: {touched.enabled && !errors.enabled && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="enabled"
                name="enabled"
                onChange={e => {
                  setFieldTouched('enabled', true);
                  setFieldValue('enabled', e.target.checked);
                }}
                isInvalid={!!errors.enabled }                  
                className={errors.enabled  ? 'error ' : ''} />
              <ErrorMessage className='error' name="enabled" component="span" />
            </label>


        
            <label htmlFor="credentialNonExpired" className="nice-form-control">
              <b>Credential Non Expired: {touched.credentialNonExpired && !errors.credentialNonExpired && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="credentialNonExpired"
                name="credentialNonExpired"
                onChange={e => {
                  setFieldTouched('credentialNonExpired', true);
                  setFieldValue('credentialNonExpired', e.target.checked);
                }}
                isInvalid={!!errors.credentialNonExpired }                  
                className={errors.credentialNonExpired  ? 'error ' : ''} />
              <ErrorMessage className='error' name="credentialNonExpired" component="span" />
            </label>


        
            <label htmlFor="accountEnabled" className="nice-form-control">
              <b>Account Enabled: {touched.accountEnabled && !errors.accountEnabled && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="accountEnabled"
                name="accountEnabled"
                onChange={e => {
                  setFieldTouched('accountEnabled', true);
                  setFieldValue('accountEnabled', e.target.checked);
                }}
                isInvalid={!!errors.accountEnabled }                  
                className={errors.accountEnabled  ? 'error ' : ''} />
              <ErrorMessage className='error' name="accountEnabled" component="span" />
            </label>


        
            <label htmlFor="accountNonLocked" className="nice-form-control">
              <b>Account Non Locked: {touched.accountNonLocked && !errors.accountNonLocked && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="accountNonLocked"
                name="accountNonLocked"
                onChange={e => {
                  setFieldTouched('accountNonLocked', true);
                  setFieldValue('accountNonLocked', e.target.checked);
                }}
                isInvalid={!!errors.accountNonLocked }                  
                className={errors.accountNonLocked  ? 'error ' : ''} />
              <ErrorMessage className='error' name="accountNonLocked" component="span" />
            </label>


        
            <label htmlFor="accountNonExpired" className="nice-form-control">
              <b>Account Non Expired: {touched.accountNonExpired && !errors.accountNonExpired && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="accountNonExpired"
                name="accountNonExpired"
                onChange={e => {
                  setFieldTouched('accountNonExpired', true);
                  setFieldValue('accountNonExpired', e.target.checked);
                }}
                isInvalid={!!errors.accountNonExpired }                  
                className={errors.accountNonExpired  ? 'error ' : ''} />
              <ErrorMessage className='error' name="accountNonExpired" component="span" />
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
                      <FaCheckCircle size={30} /> Create New Principal
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




export default PrincipalForm;
